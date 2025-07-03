<template>
    <div>
        <Number
            label="BookId"
            v-model="value.bookId"
            :editMode="editMode"
        />
        <String
            label="Title"
            v-model="value.title"
            :editMode="editMode"
        />
        <String
            label="AuthorName"
            v-model="value.authorName"
            :editMode="editMode"
        />
        <String
            label="ImageUrl"
            v-model="value.imageUrl"
            :editMode="editMode"
        />
        <String
            label="Summary"
            v-model="value.summary"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Library',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "libraries",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
