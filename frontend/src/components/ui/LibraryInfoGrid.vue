<template>
    <v-container>
        <v-snackbar
            v-model="snackbar.status"
            :timeout="snackbar.timeout"
            :color="snackbar.color"
        >
            
            <v-btn style="margin-left: 80px;" text @click="snackbar.status = false">
                Close
            </v-btn>
        </v-snackbar>
        <div class="panel">
            <div class="gs-bundle-of-buttons" style="max-height:10vh;">
                <v-btn @click="addNewRow" @class="contrast-primary-text" small color="primary">
                    <v-icon small style="margin-left: -5px;">mdi-plus</v-icon>등록
                </v-btn>
                <v-btn :disabled="!selectedRow" style="margin-left: 5px;" @click="openEditDialog()" class="contrast-primary-text" small color="primary">
                    <v-icon small>mdi-pencil</v-icon>수정
                </v-btn>
            </div>
            <div class="mb-5 text-lg font-bold"></div>
            <div class="table-responsive">
                <v-table>
                    <thead>
                        <tr>
                        <th>Id</th>
                        <th>AuthorId</th>
                        <th>AuthorName</th>
                        <th>Title</th>
                        <th>ImageUrl</th>
                        <th>Summary</th>
                        <th>Context</th>
                        <th>ClassificationType</th>
                        <th>PublishDate</th>
                        <th>SelectCount</th>
                        <th>Rank</th>
                        <th>Bestseller</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr v-for="(val, idx) in value" 
                            @click="changeSelectedRow(val)"
                            :key="val"  
                            :style="val === selectedRow ? 'background-color: rgb(var(--v-theme-primary), 0.2) !important;':''"
                        >
                            <td class="font-semibold">{{ idx + 1 }}</td>
                            <td class="whitespace-nowrap" label="AuthorId">{{ val.authorId }}</td>
                            <td class="whitespace-nowrap" label="AuthorName">{{ val.authorName }}</td>
                            <td class="whitespace-nowrap" label="Title">{{ val.title }}</td>
                            <td class="whitespace-nowrap" label="ImageUrl">{{ val.imageUrl }}</td>
                            <td class="whitespace-nowrap" label="Summary">{{ val.summary }}</td>
                            <td class="whitespace-nowrap" label="Context">{{ val.context }}</td>
                            <td class="whitespace-nowrap" label="ClassificationType">{{ val.classificationType }}</td>
                            <td class="whitespace-nowrap" label="PublishDate">{{ val.publishDate }}</td>
                            <td class="whitespace-nowrap" label="SelectCount">{{ val.selectCount }}</td>
                            <td class="whitespace-nowrap" label="Rank">{{ val.rank }}</td>
                            <td class="whitespace-nowrap" label="Bestseller">{{ val.bestseller }}</td>
                            <v-row class="ma-0 pa-4 align-center">
                                <v-spacer></v-spacer>
                                <Icon style="cursor: pointer;" icon="mi:delete" @click="deleteRow(val)" />
                            </v-row>
                        </tr>
                    </tbody>
                </v-table>
            </div>
        </div>
        <v-col>
            <v-dialog
                v-model="openDialog"
                transition="dialog-bottom-transition"
                width="35%"
            >
                <v-card>
                    <v-toolbar
                        color="primary"
                        class="elevation-0 pa-4"
                        height="50px"
                    >
                        <div style="color:white; font-size:17px; font-weight:700;">LibraryInfo 등록</div>
                        <v-spacer></v-spacer>
                        <v-icon
                            color="white"
                            small
                            @click="closeDialog()"
                        >mdi-close</v-icon>
                    </v-toolbar>
                    <v-card-text>
                        <LibraryInfo :offline="offline"
                            :isNew="!value.idx"
                            :editMode="true"
                            :inList="false"
                            v-model="newValue"
                            @add="append"
                        />
                    </v-card-text>
                </v-card>
            </v-dialog>
            <v-dialog
                v-model="editDialog"
                transition="dialog-bottom-transition"
                width="35%"
            >
                <v-card>
                    <v-toolbar
                        color="primary"
                        class="elevation-0 pa-4"
                        height="50px"
                    >
                        <div style="color:white; font-size:17px; font-weight:700;">LibraryInfo 수정</div>
                        <v-spacer></v-spacer>
                        <v-icon
                            color="white"
                            small
                            @click="closeDialog()"
                        >mdi-close</v-icon>
                    </v-toolbar>
                    <v-card-text>
                        <div>
                            <Number label="BookId" v-model="selectedRow.bookId" :editMode="true"/>
                            <Number label="AuthorId" v-model="selectedRow.authorId" :editMode="true"/>
                            <String label="AuthorName" v-model="selectedRow.authorName" :editMode="true"/>
                            <String label="Title" v-model="selectedRow.title" :editMode="true"/>
                            <String label="ImageUrl" v-model="selectedRow.imageUrl" :editMode="true"/>
                            <String label="Summary" v-model="selectedRow.summary" :editMode="true"/>
                            <String label="Context" v-model="selectedRow.context" :editMode="true"/>
                            <String label="ClassificationType" v-model="selectedRow.classificationType" :editMode="true"/>
                            <Date label="PublishDate" v-model="selectedRow.publishDate" :editMode="true"/>
                            <Number label="SelectCount" v-model="selectedRow.selectCount" :editMode="true"/>
                            <Number label="Rank" v-model="selectedRow.rank" :editMode="true"/>
                            <Boolean label="Bestseller" v-model="selectedRow.bestseller" :editMode="true"/>
                            <v-divider class="border-opacity-100 my-divider"></v-divider>
                            <v-layout row justify-end>
                                <v-btn
                                    width="64px"
                                    color="primary"
                                    @click="save"
                                >
                                    수정
                                </v-btn>
                            </v-layout>
                        </div>
                    </v-card-text>
                </v-card>
            </v-dialog>
        </v-col>
    </v-container>
</template>

<script>
import { ref } from 'vue';
import { useTheme } from 'vuetify';
import BaseGrid from '../base-ui/BaseGrid.vue'


export default {
    name: 'libraryInfoGrid',
    mixins:[BaseGrid],
    components:{
    },
    data: () => ({
        path: 'libraryInfos',
    }),
    watch: {
    },
    methods:{
    }
}

</script>